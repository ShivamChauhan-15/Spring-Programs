package com.MyTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class MyCustomTag extends TagSupport {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out= pageContext.getOut();
            for(int i=1;i<=10;i++)
                out.println("<h4>"+num+"*"+i +"="+num*i+"</h4>");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
