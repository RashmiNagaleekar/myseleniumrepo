$winHandle = WinGetHandle("Open")
WinActivate($winHandle)
ControlSetText("Open","","[Class:Edit;Instance:1]","D:\Original\traditional photo\muhurtha\Varna Ventures")
ControlClick("Open","","[Class:Button;Instance:1]")