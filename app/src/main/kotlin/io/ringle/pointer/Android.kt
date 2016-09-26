package io.ringle.pointer

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.annotation.AttrRes
import android.support.v4.content.ContextCompat
import android.util.TypedValue

fun Context.attr(@AttrRes attr: Int): TypedValue {
  val typed = TypedValue()
  theme.resolveAttribute(attr, typed, true)
  return typed
}

fun Context.drawableAttr(@AttrRes attr: Int): Drawable {
  return ContextCompat.getDrawable(this, attr(attr).resourceId)
}
