package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
 abstract public class Shape {

    public static class Color {
        int m_red, m_green, m_blue;

        public Color() {
            this(0,0,0);
        }

        public Color(int m_red, int m_green, int m_blue) {
            this.m_red = m_red;
            this.m_green = m_green;
            this.m_blue = m_blue;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "m_red=" + m_red +
                    ", m_green=" + m_green +
                    ", m_blue=" + m_blue +
                    '}';
        }
    }


    public double getArea (double side) {
        return 0;
    }

    public abstract void description ();


}
