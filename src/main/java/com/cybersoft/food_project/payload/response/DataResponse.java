package com.cybersoft.food_project.payload.response;

import lombok.Data;

@Data
public class DataResponse {
    private int status;
    private boolean isSuccess;
    private String desc;
    private Object data;
}