package typingsSlinky.hlsDashParser

import typingsSlinky.hlsDashParser.hlsDashParserMod.types.Segment
import typingsSlinky.hlsDashParser.hlsDashParserStrings.EVENT
import typingsSlinky.hlsDashParser.hlsDashParserStrings.VOD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DiscontinuitySequenceBase extends js.Object {
  var discontinuitySequenceBase: js.UndefOr[Double] = js.undefined
  var endlist: js.UndefOr[Boolean] = js.undefined
  var isIFrame: js.UndefOr[Boolean] = js.undefined
  var mediaSequenceBase: js.UndefOr[Double] = js.undefined
  var playlistType: js.UndefOr[EVENT | VOD] = js.undefined
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var targetDuration: Double
}

object Anon_DiscontinuitySequenceBase {
  @scala.inline
  def apply(
    targetDuration: Double,
    discontinuitySequenceBase: Int | Double = null,
    endlist: js.UndefOr[Boolean] = js.undefined,
    isIFrame: js.UndefOr[Boolean] = js.undefined,
    mediaSequenceBase: Int | Double = null,
    playlistType: EVENT | VOD = null,
    segments: js.Array[Segment] = null,
    source: String = null
  ): Anon_DiscontinuitySequenceBase = {
    val __obj = js.Dynamic.literal(targetDuration = targetDuration.asInstanceOf[js.Any])
    if (discontinuitySequenceBase != null) __obj.updateDynamic("discontinuitySequenceBase")(discontinuitySequenceBase.asInstanceOf[js.Any])
    if (!js.isUndefined(endlist)) __obj.updateDynamic("endlist")(endlist.asInstanceOf[js.Any])
    if (!js.isUndefined(isIFrame)) __obj.updateDynamic("isIFrame")(isIFrame.asInstanceOf[js.Any])
    if (mediaSequenceBase != null) __obj.updateDynamic("mediaSequenceBase")(mediaSequenceBase.asInstanceOf[js.Any])
    if (playlistType != null) __obj.updateDynamic("playlistType")(playlistType.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DiscontinuitySequenceBase]
  }
}

