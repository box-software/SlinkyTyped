package typingsSlinky.intlDashMessageformat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_LocalesOptions
  extends Instantiable0[DateTimeFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), DateTimeFormat]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ DateTimeFormatOptions, 
      DateTimeFormat
    ] {
  def apply(): DateTimeFormat = js.native
  def apply(locales: String): DateTimeFormat = js.native
  def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
  def apply(locales: js.Array[String]): DateTimeFormat = js.native
  def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
}

