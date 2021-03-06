package cn.hgd11.swagger.extension.annotation;

import java.lang.annotation.*;

/**************************************
 * Copyright (C), Navinfo
 * Package:
 * @author: 尚村山夫
 * @date: Created in 2019/8/14 13:58
 * @description:
 **************************************/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Hgd11SwaggerModel {
    /**
     * A brief description of this model.
     * @return
     */
    String description() default "";

    /**
     * 该模型的标题，该属性可在index属性中进行设置<br/>
     * 换句话说，即使在此进行了设置，该值也会被index属性值覆盖
     * @return
     */
    String title() default "";

    /**
     * The type of the model,eg:object
     * @return
     */
    String type() default "object";

    /**
     * The properties of the model.
     * @return
     */
    Hgd11SwaggerProperties properties();

    /**
     * title的代理
     * @return
     */
    String index();
}
