package com.example.xposetest;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;


public class Tutorial implements IXposedHookLoadPackage{
  @Override
  public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
    XposedBridge.log("Load app: " + lpparam.packageName);
    
  }
}
