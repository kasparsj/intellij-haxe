package com.intellij.plugins.haxe;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public interface HaxeIcons {
  Icon HAXE_ICON_16x16 = IconLoader.getIcon("/icons/haXe_16.png");
  Icon HAXE_ICON_24x24 = IconLoader.getIcon("/icons/haXe_24.png");

  Icon CLASS_ICON = IconLoader.getIcon("/icons/C_haXe.png");
  Icon ENUM_ICON = IconLoader.getIcon("/icons/E_haXe.png");
  Icon INTERFACE_ICON = IconLoader.getIcon("/icons/I_haXe.png");
  Icon TYPEDEF_ICON = IconLoader.getIcon("/nodes/annotationtype.png");

  Icon FUNCTION = IconLoader.getIcon("/nodes/function.png");
  Icon METHOD = IconLoader.getIcon("/nodes/method.png");
  Icon VARIABLE = IconLoader.getIcon("/nodes/variable.png");
  Icon FIELD = IconLoader.getIcon("/nodes/field.png");
  Icon PARAMETER = IconLoader.getIcon("/nodes/parameter.png");
}
