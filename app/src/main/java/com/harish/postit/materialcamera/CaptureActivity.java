package com.harish.postit.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.harish.postit.materialcamera.internal.BaseCaptureActivity;
import com.harish.postit.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
