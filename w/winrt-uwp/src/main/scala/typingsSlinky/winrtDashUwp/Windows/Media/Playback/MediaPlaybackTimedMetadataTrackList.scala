package typingsSlinky.winrtDashUwp.Windows.Media.Playback

import typingsSlinky.std.Array
import typingsSlinky.winrtDashUwp.Anon_Index
import typingsSlinky.winrtDashUwp.Anon_ItemsReturnValueNumber
import typingsSlinky.winrtDashUwp.Windows.Foundation.Collections.IIterator
import typingsSlinky.winrtDashUwp.Windows.Foundation.EventHandler
import typingsSlinky.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typingsSlinky.winrtDashUwp.Windows.Media.Core.TimedMetadataTrack
import typingsSlinky.winrtDashUwp.Windows.WinRTEvent
import typingsSlinky.winrtDashUwp.winrtDashUwpStrings.presentationmodechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a read-only list of timed metadata tracks. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackTimedMetadataTrackList")
@js.native
abstract class MediaPlaybackTimedMetadataTrackList () extends Array[TimedMetadataTrack] {
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  @JSName("onpresentationmodechanged")
  var onpresentationmodechanged_Original: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs] = js.native
  /** Gets the number of timed metadata tracks in the list. */
  var size: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  /**
    * Returns an iterator that iterates over the items in the collection.
    * @return The iterator.
    */
  def first(): IIterator[TimedMetadataTrack] = js.native
  /**
    * Returns the timed metadata track at the specified index.
    * @param index The zero-based index of the timed metadata track.
    * @return The timed metadata track at the specified index.
    */
  def getAt(index: Double): TimedMetadataTrack = js.native
  /**
    * Retrieves the timed metadata tracks that start at the specified index in the list.
    * @param startIndex The zero-based index of the start of the timed metadata tracks in the list.
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueNumber = js.native
  /**
    * Gets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is queried.
    * @return The presentation mode.
    */
  def getPresentationMode(index: Double): TimedMetadataTrackPresentationMode = js.native
  def indexOf(value: TimedMetadataTrack, extra: js.Any*): Anon_Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: TimedMetadataTrack): Double = js.native
  /** Occurs when the presentation mode of the MediaPlaybackTimedMetadataTrackList changes. */
  def onpresentationmodechanged(
    ev: TimedMetadataPresentationModeChangedEventArgs with WinRTEvent[MediaPlaybackTimedMetadataTrackList]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_presentationmodechanged(
    `type`: presentationmodechanged,
    listener: TypedEventHandler[MediaPlaybackTimedMetadataTrackList, TimedMetadataPresentationModeChangedEventArgs]
  ): Unit = js.native
  /**
    * Sets the presentation mode of the timed metadata track with the specified index.
    * @param index The index of the timed metadata track for which the presentation mode is set.
    * @param value The presentation mode to set.
    */
  def setPresentationMode(index: Double, value: TimedMetadataTrackPresentationMode): Unit = js.native
}

