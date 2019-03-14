package com.labs;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab14 extends SimpleTagSupport {
    String color;
    String size;

    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        if (color != null)
            out.write(String.format("<span style='color: %s; font-size: %s;'>%s</span>", color, size, ft.format(dNow)));
        else
            out.write(String.format("<span>%s</span>", size));
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
