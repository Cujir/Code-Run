package com.compiler.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.compiler.client.CompilerService;

public class CompilerServiceImpl extends RemoteServiceServlet implements CompilerService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}