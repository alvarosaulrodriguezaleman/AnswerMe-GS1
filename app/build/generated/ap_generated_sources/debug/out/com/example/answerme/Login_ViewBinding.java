// Generated code from Butter Knife. Do not modify!
package com.example.answerme;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatEditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Login_ViewBinding implements Unbinder {
  private Login target;

  private View view7f070071;

  private View view7f07005f;

  @UiThread
  public Login_ViewBinding(Login target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Login_ViewBinding(final Login target, View source) {
    this.target = target;

    View view;
    target.userLoginField = Utils.findRequiredViewAsType(source, R.id.userLoginField, "field 'userLoginField'", AppCompatEditText.class);
    target.passwordLoginField = Utils.findRequiredViewAsType(source, R.id.passwordLoginField, "field 'passwordLoginField'", AppCompatEditText.class);
    view = Utils.findRequiredView(source, R.id.registerButton, "method 'onClick'");
    view7f070071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.loginButton, "method 'onClick'");
    view7f07005f = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Login target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userLoginField = null;
    target.passwordLoginField = null;

    view7f070071.setOnClickListener(null);
    view7f070071 = null;
    view7f07005f.setOnClickListener(null);
    view7f07005f = null;
  }
}
