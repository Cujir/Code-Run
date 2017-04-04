package com.compiler.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("CompilerService")
public interface CompilerService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use CompilerService.App.getInstance() to access static instance of CompilerServiceAsync
     */
    public static class App {
        private static CompilerServiceAsync ourInstance = GWT.create(CompilerService.class);

        public static synchronized CompilerServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
