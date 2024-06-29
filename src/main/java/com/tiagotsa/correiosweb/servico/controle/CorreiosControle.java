package com.tiagotsa.correiosweb.servico.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiagotsa.correiosweb.servico.AtendeCliente;
import com.tiagotsa.correiosweb.servico.EnderecoERP;
import com.tiagotsa.correiosweb.servico.util.Conexao;

/**
 * Servlet implementation class CorreiosControle
 */
@WebServlet("CorreiosControle")
public class CorreiosControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AtendeCliente atendeCliente;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CorreiosControle() {
		super();
		// TODO Auto-generated constructor stub
		atendeCliente = Conexao.getServicocorreio();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cep = request.getParameter("cep");

		String enderecoResposta = "";
		try {
			EnderecoERP endereco = atendeCliente.consultaCEP(cep);
			enderecoResposta = endereco.getEnd() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + "-"
					+ endereco.getUf();
		} catch (Exception e) {
			enderecoResposta = "Endereço não existe";
		}

		// Definir o tipo de conteúdo da resposta
		response.setContentType("text/plain");

		// Enviar o endereço como resposta
		response.getWriter().write(enderecoResposta);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
