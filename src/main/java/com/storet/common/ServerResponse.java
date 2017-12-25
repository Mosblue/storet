package com.storet.common;

import java.io.Serializable;

/**
 * Create By Mok
 */
public class ServerResponse<T> implements Serializable {

        private int status;
        private String msg;
        private T data;

        private ServerResponse(int status) {
                this.status = status;
        }

        private ServerResponse(int status, T data) {
        }

}
