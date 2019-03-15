package com.example.demo.entity.dto;

import lombok.Data;

import java.util.List;

/**
 * @author changyuan.guo@hand-china.com
 * @Title ResponseDTO
 * @Description
 * @date 2019/03/12
 */
@Data
public class ResponseDTO {
    /**
     * 转态码
     */
    private String statusCode;
    /**
     * 错误信息
     */
    private String errorMessage;
    /**
     * 返回数据
     */
    private List<Object> data;

    public ResponseDTO(List<Object> data) {
        this.statusCode = "200";
        this.data = data;
    }

    public ResponseDTO(String statusCode, String errorMessage) {
        this.statusCode = statusCode;
        this.errorMessage = errorMessage;
    }
}
