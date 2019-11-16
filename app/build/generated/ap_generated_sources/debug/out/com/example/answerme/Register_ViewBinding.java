// Generated code from Butter Knife. Do not modify!
package com.example.answerme;

import android.view.View;
import android.widget.Spinner;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatEditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Register_ViewBinding implements Unbinder {
  private Register target;

  private View view7f070071;

  private View view7f070022;

  @UiThread
  public Register_ViewBinding(Register target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Register_ViewBinding(final Register target, View source) {
    this.target = target;

    View view;
    target.userNameField = Utils.findRequiredViewAsType(source, R.id.userNameField, "field 'userNameField'", AppCompatEditText.class);
    target.userEmailField = Utils.findRequiredViewAsType(source, R.id.userEmailField, "field 'userEmailField'", AppCompatEditText.class);
    target.userPasswordField = Utils.findRequiredViewAsType(source, R.id.userPasswordField, "field 'userPasswordField'", AppCompatEditText.class);
    target.countryList = Utils.findRequiredViewAsType(source, R.id.countryList, "field 'countryList'", Spinner.class);
    target.userProvinceField = Utils.findRequiredViewAsType(source, R.id.userProvinceField, "field 'userProvinceField'", AppCompatEditText.class);
    target.usernameLoginField = Utils.findRequiredViewAsType(source, R.id.usernameLoginField, "field 'usernameLoginField'", AppCompatEditText.class);
    view = Utils.findRequiredView(source, R.id.registerButton, "method 'onClick'");
    view7f070071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.backToLoginButton, "method 'onClick'");
    view7f070022 = view;
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
    Register target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.userNameField = null;
    target.userEmailField = null;
    target.userPasswordField = null;
    target.countryList = null;
    target.userProvinceField = null;
    target.usernameLoginField = null;

    view7f070071.setOnClickListener(null);
    view7f070071 = null;
    view7f070022.setOnClickListener(null);
    view7f070022 = null;
  }
}
