package com.luck.dataService.common;


import java.io.Serializable;
import java.util.Objects;

public class Resp implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer code = 200;

    private String msg = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resp resp = (Resp) o;
        return Objects.equals(this.code, resp.code) &&
                Objects.equals(this.msg, resp.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resp {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


