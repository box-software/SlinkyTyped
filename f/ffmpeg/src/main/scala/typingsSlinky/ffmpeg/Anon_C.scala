package typingsSlinky.ffmpeg

import typingsSlinky.ffmpeg.ffmpegStrings.C
import typingsSlinky.ffmpeg.ffmpegStrings.CE
import typingsSlinky.ffmpeg.ffmpegStrings.CW
import typingsSlinky.ffmpeg.ffmpegStrings.NC
import typingsSlinky.ffmpeg.ffmpegStrings.NE
import typingsSlinky.ffmpeg.ffmpegStrings.NW
import typingsSlinky.ffmpeg.ffmpegStrings.SC
import typingsSlinky.ffmpeg.ffmpegStrings.SE
import typingsSlinky.ffmpeg.ffmpegStrings.SW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var margin_east: Double
  var margin_nord: Double
  var margin_sud: Double
  var margin_west: Double
  var position: NE | NC | NW | SE | SC | SW | C | CE | CW
}

object Anon_C {
  @scala.inline
  def apply(
    margin_east: Double,
    margin_nord: Double,
    margin_sud: Double,
    margin_west: Double,
    position: NE | NC | NW | SE | SC | SW | C | CE | CW
  ): Anon_C = {
    val __obj = js.Dynamic.literal(margin_east = margin_east.asInstanceOf[js.Any], margin_nord = margin_nord.asInstanceOf[js.Any], margin_sud = margin_sud.asInstanceOf[js.Any], margin_west = margin_west.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_C]
  }
}

