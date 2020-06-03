package com.example.test;

import org.junit.jupiter.api.Test;

public class TestTextBlock {

    /**
     * 开始分隔符后面的行结束符后的第一个字符开始
     * 结束分隔符前的第一个字符结束
     * 编译器编译，会删除每行后面的空白字符，结束符前面有多少空白字符，每行前的空白字符就会被删除多少
     */
    @Test
    public void test() {
        String str = """
                     <html>
                  <p>
                            111111
                                    </p>
                     </html>""";

        System.out.println(str);
    }
}
