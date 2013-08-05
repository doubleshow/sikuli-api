package org.sikuli.api.event;

import java.util.EventListener;


interface VisualEventListener extends EventListener{
}

/**
 * Interface for a screen region to register and receive notifications when a target has
 * appeared, vanished, or moved within this screen region.
 * 
 * @author Tom Yeh (tom.yeh@colorado.edu)
 *
 */
public interface TargetEventListener extends VisualEventListener {
	
	/**
	 * Invoked when a target has appeared in a screen region.
	 * 
	 * @param event the TargetEvent object for the target that might appear.<p>
	 * event.getTarget() returns the target that has just appeared.<p>
	 * event.getScreenRegion() returns the screen region where the target is being watched.<p>
	 * event.getTargetRegion() returns the screen region currently occupied by the target.<p>
	 * 
	 * 
	 */
	public void targetAppeared(TargetEvent event);

	/**
	 * Invoked when a target has vanished from a screen region.<p>
	 * 
	 * @param event the TargetEvent object for the target that might vanish.<p>
	 * 
	 * event.getTarget() returns the target that has just vanished.<p>
	 * event.getScreenRegion() returns the screen region where the target is being watched.<p>
	 * event.getTargetRegion() returns the screen region last occupied by the target before it vanished.<p>
	 */
	public void targetVanished(TargetEvent event);
	
	/**
	 * Invoked when a target has moved to another location in a screen region.<p>
	 * 
	 * @param event the TargetEvent object for the target that might move.<p>
	 * 
	 * event.getTarget() returns the target that has just moved.<p>
	 * event.getScreenRegion() returns the screen region where the target is being watched.<p>
	 * event.getTargetRegion() returns the screen region currently occupied by the target (i.e., the region
	 * the target has just moved to).<p>
	 * 
	 */
	public void targetMoved(TargetEvent event);
}