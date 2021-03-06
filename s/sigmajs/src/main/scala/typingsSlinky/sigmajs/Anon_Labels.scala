package typingsSlinky.sigmajs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sigmajs.SigmaJs.Edge
import typingsSlinky.sigmajs.SigmaJs.SVGEdgeLabels
import typingsSlinky.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Labels extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  var labels: SVGEdgeLabels
}

object Anon_Labels {
  @scala.inline
  def apply(
    labels: SVGEdgeLabels,
    StringDictionary: /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] = null
  ): Anon_Labels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Labels]
  }
}

