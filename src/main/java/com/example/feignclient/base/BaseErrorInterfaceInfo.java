package com.example.feignclient.base;

public enum BaseErrorInterfaceInfo implements BaseErrorInterface {
    /**
     * 成功
     */
    SUCCESS("200", "ok"),

    /**
     * 资源创建成功
     */
    CREAT_SUCC("201", "created succeed"),

    /**
     * 资源更新成功
     */
    UPDATE_SUCC("202", "update succeed"),

    /**
     * 资源删除成功
     */
    DELETE_SUCC("204", "delete succeed"),

    /**
     * 没有变化
     */
    UNCHANGED("304", "not modified"),

    /**
     * 请求格式错误
     */
    BAD_REQUEST("400", "bad request"),

    /**
     * 未授权
     */
    NOT_LOGIN("401", "unauthorized"),

    /**
     * 鉴权成功，但是该用户没有权限
     */
    SEVICE_EXCEPTION("403", "forbidden"),

    /**
     * 请求的资源不存在
     */
    SEVICE_ERROR("404", "not found"),

    /**
     * 该http方法不被允许
     */
    SEVICE_NOT_ALLOWED("405", "method not allowed"),
    /**
     * 不可指定的请求体 – 只有服务器不能处理实体时使用，比如图像不能被格式化，或者重要字段丢失。
     */
    PARAMS_ERROR("422", "请求错误"),

    /**
     * 标准服务端错误，API开发人员应该尽量避开这种错误
     */
    SERVER_ERROR("500", "服务端错误");

    BaseErrorInterfaceInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
