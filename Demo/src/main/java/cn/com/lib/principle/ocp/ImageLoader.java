package cn.com.lib.principle.ocp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 15:44
 * Describe:
 */
public class ImageLoader {

    public void Display(String url){
        ImageUitl imageUitl=new ImageUitl();
        //1.优先从内存缓存读取
        imageUitl.setImageCache(new MemoryImageCache());
        Bitmap bitmap=imageUitl.getBitmap(url);
        //2.优先从本地存储读取
        imageUitl.setImageCache(new DiskImageCache());
        Bitmap bitmap2=imageUitl.getBitmap(url);
        //3.当都不满足时，可以轻松扩展
        imageUitl.setImageCache(new ImageCache() {
            @Override
            public void put(Bitmap image) {
                //扩展存储
            }

            @Override
            public Bitmap get(String url) {
                //自定义读取
                return null;
            }
        });
        Bitmap bitmap3=imageUitl.getBitmap(url);

    }
}
