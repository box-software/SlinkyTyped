package typingsSlinky.videoDotJs.videoDotJsMod.default.TextTrackCueList

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.videoDotJs.videoDotJsMod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "TextTrackCueList")
@js.native
class ^ protected ()
  extends typingsSlinky.videoDotJs.videoDotJsMod.videojs.TextTrackCueList {
  /**
    * Create an instance of this class..
    *
    * @param cues
    *        A list of cues to be initialized with
    */
  def this(cues: js.Array[TextTrackCue]) = this()
  /**
    * The current number of `TextTrackCue`s in the TextTrackCueList.
    */
  /* CompleteClass */
  override var length: Double = js.native
  /**
    * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    *
    * @param id
    *        The id of the cue that should be searched for.
    *
    * @return A single cue or null if none was found.
    */
  /* CompleteClass */
  override def getCueById(id: String): TextTrackCue = js.native
}

@JSImport("video.js", "TextTrackCueList")
@js.native
object ^
  extends TopLevel[
      /**
  * Create an instance of this class..
  *
  * @param cues
  *        A list of cues to be initialized with
  */
Instantiable1[
        /* cues */ js.Array[TextTrackCue], 
        typingsSlinky.videoDotJs.videoDotJsMod.videojs.TextTrackCueList
      ]
    ]

