package typingsSlinky.playcanvas.pc

import typingsSlinky.playcanvas.Anon_FpsLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.SpriteAnimationClip
  * @extends pc.EventHandler
  * @classdesc Handles playing of sprite animations and loading of relevant sprite assets.
  * @param {pc.SpriteComponent} component The sprite component managing this clip.
  * @param {Object} data Data for the new animation clip.
  * @param {Number} [data.fps] Frames per second for the animation clip.
  * @param {Object} [data.loop] Whether to loop the animation clip.
  * @param {String} [data.name] The name of the new animation clip.
  * @param {Number} [data.spriteAsset] The id of the sprite asset that this clip will play.
  * @property {Number} spriteAsset The id of the sprite asset used to play the animation.
  * @property {pc.Sprite} sprite The current sprite used to play the animation.
  * @property {Number} frame The index of the frame of the {@link pc.Sprite} currently being rendered.
  * @property {Number} time The current time of the animation in seconds.
  * @property {Number} duration The total duration of the animation in seconds.
  * @property {Boolean} isPlaying Whether the animation is currently playing.
  * @property {Boolean} isPaused Whether the animation is currently paused.
  */
@JSGlobal("pc.SpriteAnimationClip")
@js.native
class SpriteAnimationClip protected () extends EventHandler {
  def this(component: SpriteComponent, data: Anon_FpsLoop) = this()
  /**
    * The total duration of the animation in seconds.
    */
  var duration: Double = js.native
  /**
    * The index of the frame of the {@link pc.Sprite} currently being rendered.
    */
  var frame: Double = js.native
  /**
    * Whether the animation is currently paused.
    */
  var isPaused: Boolean = js.native
  /**
    * Whether the animation is currently playing.
    */
  var isPlaying: Boolean = js.native
  /**
    * The current sprite used to play the animation.
    */
  var sprite: Sprite = js.native
  /**
    * The id of the sprite asset used to play the animation.
    */
  var spriteAsset: Double = js.native
  /**
    * The current time of the animation in seconds.
    */
  var time: Double = js.native
  /**
    * @function
    * @name pc.SpriteAnimationClip#pause
    * @description Pauses the animation.
    */
  def pause(): Unit = js.native
  /**
    * @function
    * @name pc.SpriteAnimationClip#play
    * @description Plays the animation. If it's already playing then this does nothing.
    */
  def play(): Unit = js.native
  /**
    * @function
    * @name pc.SpriteAnimationClip#resume
    * @description Resumes the paused animation.
    */
  def resume(): Unit = js.native
  /**
    * @function
    * @name pc.SpriteAnimationClip#stop
    * @description Stops the animation and resets the animation to the first frame.
    */
  def stop(): Unit = js.native
}

