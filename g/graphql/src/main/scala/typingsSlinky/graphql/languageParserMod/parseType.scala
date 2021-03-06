package typingsSlinky.graphql.languageParserMod

import typingsSlinky.graphql.languageAstMod.TypeNode
import typingsSlinky.graphql.languageSourceMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/parser", "parseType")
@js.native
object parseType extends js.Object {
  def apply(source: String): TypeNode = js.native
  def apply(source: String, options: ParseOptions): TypeNode = js.native
  def apply(source: Source): TypeNode = js.native
  def apply(source: Source, options: ParseOptions): TypeNode = js.native
}

