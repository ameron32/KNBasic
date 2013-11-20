package com.ameron32.knbasic;

import android.content.Context;
import android.util.AttributeSet;

public class CustomSlidingLayer extends com.slidinglayer.SlidingLayer {

	private boolean isSlidingLayerOpen = false;
	
	public boolean isSlidingLayerOpen() {
		return isSlidingLayerOpen;
	}
		
	public void closeSlidingLayer() {
		if (isSlidingLayerOpen()) {
			toggleSlidingLayer();
		}
	}
	
	public void openSlidingLayer() {
		if (!isSlidingLayerOpen()) {
			toggleSlidingLayer();
		}
	}
	
	public void toggleSlidingLayer() {
		slidingLayerToggle();
	}
	
	/**
	 * If not null, switch case on view IDs. If null, auto-open sliding layer.
	 */
	private void slidingLayerToggle() {
		if (isSlidingLayerOpen) {
			closeLayer(true);
		} else {
			openLayer(true);
		}
		isSlidingLayerOpen = !isSlidingLayerOpen;
	}

	
	
	
	
	public CustomSlidingLayer(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public CustomSlidingLayer(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	
	public CustomSlidingLayer(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
}
