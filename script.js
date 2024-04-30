Java.perform(() => {
  const InternalClickListener = Java.use('com.example.fridaandroid13.InternalClickListener');
  console.log(InternalClickListener.onClick);
  InternalClickListener.onClick.implementation = function (v) {
    console.log('onClick() called');
    return this.onClick(v);
  };
  console.log('Script loaded');
});
console.log('Script loaded successfully');