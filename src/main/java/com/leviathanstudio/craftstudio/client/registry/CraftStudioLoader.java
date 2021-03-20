package com.leviathanstudio.craftstudio.client.registry;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
/**
 * Annotation to indicate that the method it is applied on should be called
 * during the loading of CraftStudio assets. Must be applied on a 'static'
 * method with no arguments.
 * 
 * @since 1.0.0
 * 
 * @author Timmypote
 */
@OnlyIn(Dist.CLIENT)
@Retention(RUNTIME)
@Target(METHOD)
public @interface CraftStudioLoader {}
