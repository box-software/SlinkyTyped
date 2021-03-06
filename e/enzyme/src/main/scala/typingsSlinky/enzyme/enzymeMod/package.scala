package typingsSlinky.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object enzymeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.react.reactMod.AllHTMLAttributes
  import typingsSlinky.react.reactMod.SVGAttributes
  import typingsSlinky.react.reactMod._Global_.JSX.Element

  type ComponentType[Props] = ComponentClass[Props] | StatelessComponent[Props]
  type EnzymePropSelector = StringDictionary[js.Any]
  type EnzymeSelector = String | StatelessComponent[js.Any] | ComponentClass[js.Any] | EnzymePropSelector
  type HTMLAttributes = AllHTMLAttributes[js.Object] with SVGAttributes[js.Object]
  type Intercepter[T] = js.Function1[/* intercepter */ T, Unit]
  type Parameters[T] = js.Any
  type StatelessComponent[Props] = js.Function2[/* props */ Props, /* context */ js.UndefOr[js.Any], Element | Null]
}
