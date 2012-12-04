package br.com.rio.app.riolegal.integracao.facebook;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

import br.com.rio.app.riolegal.exception.AmbienteException;

public class ConectorFacebook {

	public String obtemJsonRespostaFacebook(String urlDestino) {
		try {
			URL url = new URL(urlDestino);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			InputStream is = url.openStream();
			int r;
			while ((r = is.read()) != -1) {
				baos.write(r);
			}
			return new String(baos.toByteArray());
		} catch (Exception e) {
			throw new AmbienteException(
					"N‹o foi poss’vel obter retorno do Facebook."
							+ e.getMessage());
		}
	}

	public String obtemTokenConexaoFacebook(String jsonToken) {
		String pairs[] = jsonToken.split("&");
		String accessToken = null;
		int expires = 0;
		for (String pair : pairs) {
			String[] kv = pair.split("=");
			if (kv.length != 2) {
				throw new RuntimeException("Unexpected auth response");
			} else {
				if (kv[0].equals("access_token")) {
					accessToken = kv[1];
				}
				if (kv[0].equals("expires")) {
					expires = Integer.valueOf(kv[1]);
				}
			}
		}
		return accessToken;
	}

}
