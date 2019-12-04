package typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CssTokenType extends js.Object

@JSImport("@angular/compiler/src/css_parser/css_lexer", "CssTokenType")
@js.native
object CssTokenType extends js.Object {
  @js.native
  sealed trait AtKeyword extends CssTokenType
  
  @js.native
  sealed trait Character extends CssTokenType
  
  @js.native
  sealed trait Comment extends CssTokenType
  
  @js.native
  sealed trait EOF extends CssTokenType
  
  @js.native
  sealed trait Identifier extends CssTokenType
  
  @js.native
  sealed trait IdentifierOrNumber extends CssTokenType
  
  @js.native
  sealed trait Invalid extends CssTokenType
  
  @js.native
  sealed trait Number extends CssTokenType
  
  @js.native
  sealed trait String extends CssTokenType
  
  @js.native
  sealed trait Whitespace extends CssTokenType
  
  /* 6 */ val AtKeyword: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.AtKeyword with Double = js.native
  /* 7 */ val Character: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Character with Double = js.native
  /* 2 */ val Comment: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Comment with Double = js.native
  /* 0 */ val EOF: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.EOF with Double = js.native
  /* 3 */ val Identifier: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Identifier with Double = js.native
  /* 5 */ val IdentifierOrNumber: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.IdentifierOrNumber with Double = js.native
  /* 9 */ val Invalid: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Invalid with Double = js.native
  /* 4 */ val Number: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Number with Double = js.native
  /* 1 */ val String: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.String with Double = js.native
  /* 8 */ val Whitespace: typingsSlinky.atAngularCompiler.srcCssUnderscoreParserCssUnderscoreLexerMod.CssTokenType.Whitespace with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CssTokenType with Double] = js.native
}

