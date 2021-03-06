package typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LayersControl

import typingsSlinky.leaflet.leafletMod.Layer
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.AddLayerHandler
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.Children
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.LeafletContext
import typingsSlinky.reactDashLeaflet.reactDashLeafletMod.RemoveLayerHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlledLayerProps extends js.Object {
  var addBaseLayer: js.UndefOr[AddLayerHandler] = js.undefined
  var addOverlay: js.UndefOr[AddLayerHandler] = js.undefined
  var checked: js.UndefOr[Boolean] = js.undefined
  var children: Children
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  var name: String
  var removeLayer: js.UndefOr[RemoveLayerHandler] = js.undefined
  var removeLayerControl: js.UndefOr[RemoveLayerHandler] = js.undefined
}

object ControlledLayerProps {
  @scala.inline
  def apply(
    name: String,
    addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit = null,
    addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: Children = null,
    leaflet: LeafletContext = null,
    removeLayer: /* layer */ Layer => Unit = null,
    removeLayerControl: /* layer */ Layer => Unit = null
  ): ControlledLayerProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (addBaseLayer != null) __obj.updateDynamic("addBaseLayer")(js.Any.fromFunction3(addBaseLayer))
    if (addOverlay != null) __obj.updateDynamic("addOverlay")(js.Any.fromFunction3(addOverlay))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (leaflet != null) __obj.updateDynamic("leaflet")(leaflet.asInstanceOf[js.Any])
    if (removeLayer != null) __obj.updateDynamic("removeLayer")(js.Any.fromFunction1(removeLayer))
    if (removeLayerControl != null) __obj.updateDynamic("removeLayerControl")(js.Any.fromFunction1(removeLayerControl))
    __obj.asInstanceOf[ControlledLayerProps]
  }
}

