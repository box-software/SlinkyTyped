package typingsSlinky.giphyDashApi.giphyDashApiMod

import typingsSlinky.giphyDashApi.Anon_Frames
import typingsSlinky.giphyDashApi.Anon_Height
import typingsSlinky.giphyDashApi.Anon_Mp4
import typingsSlinky.giphyDashApi.Anon_Mp4String
import typingsSlinky.giphyDashApi.Anon_Size
import typingsSlinky.giphyDashApi.Anon_SizeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Images extends js.Object {
  var downsized: BaseImage with Anon_SizeString
  var downsized_large: BaseImage with Anon_SizeString
  var downsized_medium: BaseImage with Anon_SizeString
  var downsized_small: BaseImage with Anon_SizeString
  var downsized_still: BaseImage
  var fixed_height: BaseImage with Anon_Mp4
  var fixed_height_downsampled: BaseImage with Anon_Size
  var fixed_height_small: BaseImage with Anon_Mp4
  var fixed_height_small_still: BaseImage
  var fixed_height_still: BaseImage
  var fixed_width: BaseImage with Anon_Mp4
  var fixed_width_downsampled: BaseImage with Anon_Size
  var fixed_width_small: BaseImage with Anon_Mp4
  var fixed_width_small_still: BaseImage
  var fixed_width_still: BaseImage
  var looping: Anon_Mp4String
  var original: BaseImage with Anon_Frames
  var original_still: BaseImage
  var preview: Anon_Height
  var preview_gif: BaseImage with Anon_SizeString
}

object Images {
  @scala.inline
  def apply(
    downsized: BaseImage with Anon_SizeString,
    downsized_large: BaseImage with Anon_SizeString,
    downsized_medium: BaseImage with Anon_SizeString,
    downsized_small: BaseImage with Anon_SizeString,
    downsized_still: BaseImage,
    fixed_height: BaseImage with Anon_Mp4,
    fixed_height_downsampled: BaseImage with Anon_Size,
    fixed_height_small: BaseImage with Anon_Mp4,
    fixed_height_small_still: BaseImage,
    fixed_height_still: BaseImage,
    fixed_width: BaseImage with Anon_Mp4,
    fixed_width_downsampled: BaseImage with Anon_Size,
    fixed_width_small: BaseImage with Anon_Mp4,
    fixed_width_small_still: BaseImage,
    fixed_width_still: BaseImage,
    looping: Anon_Mp4String,
    original: BaseImage with Anon_Frames,
    original_still: BaseImage,
    preview: Anon_Height,
    preview_gif: BaseImage with Anon_SizeString
  ): Images = {
    val __obj = js.Dynamic.literal(downsized = downsized.asInstanceOf[js.Any], downsized_large = downsized_large.asInstanceOf[js.Any], downsized_medium = downsized_medium.asInstanceOf[js.Any], downsized_small = downsized_small.asInstanceOf[js.Any], downsized_still = downsized_still.asInstanceOf[js.Any], fixed_height = fixed_height.asInstanceOf[js.Any], fixed_height_downsampled = fixed_height_downsampled.asInstanceOf[js.Any], fixed_height_small = fixed_height_small.asInstanceOf[js.Any], fixed_height_small_still = fixed_height_small_still.asInstanceOf[js.Any], fixed_height_still = fixed_height_still.asInstanceOf[js.Any], fixed_width = fixed_width.asInstanceOf[js.Any], fixed_width_downsampled = fixed_width_downsampled.asInstanceOf[js.Any], fixed_width_small = fixed_width_small.asInstanceOf[js.Any], fixed_width_small_still = fixed_width_small_still.asInstanceOf[js.Any], fixed_width_still = fixed_width_still.asInstanceOf[js.Any], looping = looping.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], original_still = original_still.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], preview_gif = preview_gif.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Images]
  }
}

