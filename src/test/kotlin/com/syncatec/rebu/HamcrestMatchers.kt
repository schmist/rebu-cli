package com.syncatec.rebu

import org.hamcrest.Matcher
import org.hamcrest.Matchers.equalTo

fun <T> iz(operand: T?): Matcher<in T?> = equalTo<T>(operand)