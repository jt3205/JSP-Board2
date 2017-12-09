package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface URIHandler {
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception;;
}
