package cn.com.lib.principle.ocp;

/**
 * Created by Else.
 * Date: 2019/12/31
 * Time: 15:48
 * Describe: ImageUitl用来获取Bitmap，先从缓存读取，再从网络读取
 */
public class ImageUitl {
    ImageCache imageCache;
    public Bitmap getBitmap(String url){
        if(imageCache.get(url)!=null){
            return imageCache.get(url);
        }
        return downLoad(url);
    }

    private Bitmap downLoad(String url){
        //模拟网络下载
        Bitmap bitmap=new Bitmap("网络："+url);
        imageCache.put(bitmap);
        return bitmap;
    }

    public void setImageCache(ImageCache imageCache) {
        this.imageCache = imageCache;
    }
}
