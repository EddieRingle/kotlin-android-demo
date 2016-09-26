package io.ringle.pointer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.MarginLayoutParams
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.backgroundDrawable
import org.jetbrains.anko.dip
import org.jetbrains.anko.frameLayout
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.onClick
import org.jetbrains.anko.padding
import org.jetbrains.anko.scrollView
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout
import org.jetbrains.anko.view
import org.jetbrains.anko.wrapContent

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    scrollView {
      isFillViewport = true
      verticalLayout {
        layoutParams = MarginLayoutParams(matchParent, wrapContent)

        fun row(text: String, action: () -> Unit) {
          frameLayout {
            backgroundDrawable = drawableAttr(R.attr.selectableItemBackground)
            padding = dip(16)
            onClick { action() }

            textView(text) {
              textSize = 18f
            }
          }
          view {
            backgroundColor = 0xDDDDDD
          }.lparams(matchParent, dip(1))
        }

        row("XML example") {
          startActivity<XmlLayoutActivity>()
        }
      }
    }
  }
}
