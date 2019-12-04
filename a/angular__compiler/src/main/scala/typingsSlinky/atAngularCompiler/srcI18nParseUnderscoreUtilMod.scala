package typingsSlinky.atAngularCompiler

import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseError
import typingsSlinky.atAngularCompiler.srcParseUnderscoreUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/i18n/parse_util", JSImport.Namespace)
@js.native
object srcI18nParseUnderscoreUtilMod extends js.Object {
  @js.native
  class I18nError protected () extends ParseError {
    def this(span: ParseSourceSpan, msg: String) = this()
  }
  
}

