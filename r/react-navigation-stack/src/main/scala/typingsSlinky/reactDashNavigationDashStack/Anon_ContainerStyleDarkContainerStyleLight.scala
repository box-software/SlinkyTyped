package typingsSlinky.reactDashNavigationDashStack

import typingsSlinky.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerStyleDarkContainerStyleLight extends js.Object {
  var containerStyleDark: Anon_BackgroundColor
  var containerStyleLight: Anon_BackgroundColor
  var transitionSpec: Anon_Damping | Anon_Config
  def screenInterpolator(props: SceneInterpolatorProps): Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY
}

object Anon_ContainerStyleDarkContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: Anon_BackgroundColor,
    containerStyleLight: Anon_BackgroundColor,
    screenInterpolator: SceneInterpolatorProps => Anon_OpacityTransformAnonTranslateXTranslateY | Anon_OpacityTransform | Anon_OpacityTransformAnonTranslateY,
    transitionSpec: Anon_Damping | Anon_Config
  ): Anon_ContainerStyleDarkContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], screenInterpolator = js.Any.fromFunction1(screenInterpolator), transitionSpec = transitionSpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContainerStyleDarkContainerStyleLight]
  }
}

