package io.ringle.pointer

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import org.jetbrains.anko.find
import org.jetbrains.anko.onClick
import org.jetbrains.anko.toast

class XmlLayoutActivity : AppCompatActivity() {

  val button by lazy { find<TextView>(R.id.clickMe) }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_xml)
    button.onClick {
      toast("Yay!")
    }
  }
}
