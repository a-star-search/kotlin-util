/*
 * Copyright (c) 2018.  This file is subject to the terms and conditions defined in file 'LICENSE.txt', which is part of this source code package.
 */

package com.moduleforge.util

object Util {
   fun <T, U> addElementToValues(map: MutableMap<T, MutableSet<U>>, key: T, elem: U) {
      val set = map[key]
      if (set == null)
         map[key] = mutableSetOf(elem)
      else
         map[key]!!.add(elem)
   }
}