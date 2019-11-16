// Generated code from Butter Knife. Do not modify!
package com.example.answerme;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Profile_ViewBinding implements Unbinder {
  private Profile target;

  @UiThread
  public Profile_ViewBinding(Profile target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Profile_ViewBinding(Profile target, View source) {
    this.target = target;

    target.userName = Utils.findRequiredViewAsType(source, R.id.user_name, "field 'userName'", TextView.class);
    target.userEmail = Utils.findRequiredViewAsType(source, R.id.user_email, "field 'userEmail'", TextView.class);
    target.userCountry = Utils.findRequiredViewAsType(source, R.id.user_country, "field 'userCountry'", TextView.class);
    target.userProvince = Utils.findRequiredViewAsType(source, R.id.user_province, "field 'userProvince'", TextView.class);
    target.userRole = Utils.findRequiredViewAsType(source, R.id.user_role, "field 'userRole'", TextView.class);
    target.userPoints = Utils.findRequiredViewAsType(source, R.id.user_points, "field 'userPoints'", TextView.class);
    target.userUsername = Utils.findRequiredViewAsType(source, R.id.user_username, "field 'userUsername'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Profile target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userName = null;
    target.userEmail = null;
    target.userCountry = null;
    target.userProvince = null;
    target.userRole = null;
    target.userPoints = null;
    target.userUsername = null;
  }
}
