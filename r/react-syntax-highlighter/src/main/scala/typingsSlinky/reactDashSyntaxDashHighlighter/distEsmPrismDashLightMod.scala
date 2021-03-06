package typingsSlinky.reactDashSyntaxDashHighlighter

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSyntaxDashHighlighter.reactDashSyntaxDashHighlighterMod.SyntaxHighlighterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-syntax-highlighter/dist/esm/prism-light", JSImport.Namespace)
@js.native
object distEsmPrismDashLightMod extends js.Object {
  @js.native
  class default ()
    extends Component[SyntaxHighlighterProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object default extends js.Object {
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  type SyntaxHighlighter = ReactComponentClass[SyntaxHighlighterProps]
}

