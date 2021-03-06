package typingsSlinky.easyDashXDashHeaders

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SlowBuffer")
@js.native
class SlowBuffer protected () extends NodeBuffer {
  def this(array: js.Array[_]) = this()
  def this(size: Double) = this()
  def this(size: scala.scalajs.js.typedarray.Uint8Array) = this()
  def this(str: String) = this()
  def this(str: String, encoding: String) = this()
}

@JSGlobal("SlowBuffer")
@js.native
object SlowBuffer
  extends Instantiable1[
      (/* array */ js.Array[js.Any]) | (/* size */ Double) | (/* str */ String) | (/* size */ Uint8Array), 
      Buffer
    ]
     with Instantiable2[/* str */ String, /* encoding */ String, Buffer] {
  def byteLength(string: String): Double = js.native
  def byteLength(string: String, encoding: String): Double = js.native
  def concat(list: js.Array[Buffer]): Buffer = js.native
  def concat(list: js.Array[Buffer], totalLength: Double): Buffer = js.native
  def isBuffer(obj: js.Any): Boolean = js.native
}

