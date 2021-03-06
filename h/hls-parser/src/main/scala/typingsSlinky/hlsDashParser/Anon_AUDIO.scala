package typingsSlinky.hlsDashParser

import typingsSlinky.hlsDashParser.hlsDashParserMod.types.Rendition
import typingsSlinky.hlsDashParser.hlsDashParserStrings.AUDIO
import typingsSlinky.hlsDashParser.hlsDashParserStrings.SUBTITLES
import typingsSlinky.hlsDashParser.hlsDashParserStrings.VIDEO
import typingsSlinky.hlsDashParser.hlsDashParserStrings.`CLOSED-CAPTIONS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIO extends js.Object {
  var audio: js.UndefOr[js.Array[Rendition[AUDIO]]] = js.undefined
  var averageBandwidth: js.UndefOr[Double] = js.undefined
  var bandwidth: Double
  var closedCaptions: js.UndefOr[js.Array[Rendition[`CLOSED-CAPTIONS`]]] = js.undefined
  var codecs: js.UndefOr[String] = js.undefined
  var currentRenditions: js.UndefOr[Anon_Audio] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var hdcpLevel: js.UndefOr[String] = js.undefined
  var isIFrameOnly: js.UndefOr[Boolean] = js.undefined
  var resolution: js.UndefOr[Anon_Height] = js.undefined
  var subtitles: js.UndefOr[js.Array[Rendition[SUBTITLES]]] = js.undefined
  var uri: String
  var video: js.UndefOr[js.Array[Rendition[VIDEO]]] = js.undefined
}

object Anon_AUDIO {
  @scala.inline
  def apply(
    bandwidth: Double,
    uri: String,
    audio: js.Array[Rendition[AUDIO]] = null,
    averageBandwidth: Int | Double = null,
    closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = null,
    codecs: String = null,
    currentRenditions: Anon_Audio = null,
    frameRate: Int | Double = null,
    hdcpLevel: String = null,
    isIFrameOnly: js.UndefOr[Boolean] = js.undefined,
    resolution: Anon_Height = null,
    subtitles: js.Array[Rendition[SUBTITLES]] = null,
    video: js.Array[Rendition[VIDEO]] = null
  ): Anon_AUDIO = {
    val __obj = js.Dynamic.literal(bandwidth = bandwidth.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (averageBandwidth != null) __obj.updateDynamic("averageBandwidth")(averageBandwidth.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions.asInstanceOf[js.Any])
    if (codecs != null) __obj.updateDynamic("codecs")(codecs.asInstanceOf[js.Any])
    if (currentRenditions != null) __obj.updateDynamic("currentRenditions")(currentRenditions.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (hdcpLevel != null) __obj.updateDynamic("hdcpLevel")(hdcpLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(isIFrameOnly)) __obj.updateDynamic("isIFrameOnly")(isIFrameOnly.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AUDIO]
  }
}

trait Anon_Audio extends js.Object {
  var audio: js.UndefOr[Double] = js.undefined
  var closedCaptions: js.UndefOr[Double] = js.undefined
  var subtitles: js.UndefOr[Double] = js.undefined
  var video: js.UndefOr[Double] = js.undefined
}

object Anon_Audio {
  @scala.inline
  def apply(
    audio: Int | Double = null,
    closedCaptions: Int | Double = null,
    subtitles: Int | Double = null,
    video: Int | Double = null
  ): Anon_Audio = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (closedCaptions != null) __obj.updateDynamic("closedCaptions")(closedCaptions.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Audio]
  }
}

