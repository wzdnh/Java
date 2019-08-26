import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.MemoryImageSource;
import java.util.Random;
 
public class Jhanabi extends Applet
  implements Runnable
{
  private int m_nAppX;
  private int m_nAppY;
  private int m_centerX;
  private int m_centerY;
  private int m_mouseX = 0;
  private int m_mouseY = 0;
  private int m_sleepTime = 5;
 
  private boolean isError = false;
  private boolean m_isPaintFinished;
  boolean isRunning;
  boolean isInitialized = false;
  Thread runner;
  int[] pix0;
  MemoryImageSource offImage;
  Image dbImg;
  int pixls;
  int pixls2;
  Random rand = new Random();
 
  int bits = 10000;
  double[] bit_px = new double[this.bits];
  double[] bit_py = new double[this.bits];
  double[] bit_vx = new double[this.bits];
  double[] bit_vy = new double[this.bits];
  int[] bit_sx = new int[this.bits];
  int[] bit_sy = new int[this.bits];
  int[] bit_l = new int[this.bits];
  int[] bit_f = new int[this.bits];
  int[] bit_p = new int[this.bits];
  int[] bit_c = new int[this.bits];
  int bit_max;
  int bit_sound;
  int ru = 50;
  int rv = 50;
  AudioClip sound1;
  AudioClip sound2;
 
  public void init()
  {
    String str = getParameter("para_bits"); if (str != null) this.bits = Integer.parseInt(str);
    str = getParameter("para_max"); if (str != null) this.bit_max = Integer.parseInt(str);
    str = getParameter("para_blendx"); if (str != null) this.ru = Integer.parseInt(str);
    str = getParameter("para_blendy"); if (str != null) this.rv = Integer.parseInt(str);
    str = getParameter("para_sound"); if (str != null) this.bit_sound = Integer.parseInt(str);
 
    this.m_nAppX = size().width;
    this.m_nAppY = size().height;
    this.m_centerX = (this.m_nAppX / 2);
    this.m_centerY = (this.m_nAppY / 2);
    this.m_mouseX = this.m_centerX;
    this.m_mouseY = this.m_centerY;
    resize(this.m_nAppX, this.m_nAppY);
 
    this.pixls = (this.m_nAppX * this.m_nAppY);
    this.pixls2 = (this.pixls - this.m_nAppX * 2);
    this.pix0 = new int[this.pixls];
    this.offImage = new MemoryImageSource(this.m_nAppX, this.m_nAppY, this.pix0, 0, this.m_nAppX);
    this.offImage.setAnimated(true);
    this.dbImg = createImage(this.offImage);
 
    for (int i = 0; i < this.pixls; i++) {
      this.pix0[i] = -16777216;
    }
 
    this.sound1 = getAudioClip(getDocumentBase(), "firework.au");
    this.sound2 = getAudioClip(getDocumentBase(), "syu.au");
 
    for (int j = 0; j < this.bits; j++) {
      this.bit_f[j] = 0;
    }
 
    this.isInitialized = true;
    start();
  }
 
  public void run()
  {
    while (true)
    {
      try
      {
        Thread.sleep(200L);
      }
      catch (InterruptedException localInterruptedException1)
      {
      }
      if (this.isInitialized)
      {
        break;
      }
    }while (true) {
      for (int j = 0; j < this.pixls2; j++)
      {
        int k = this.pix0[j];
        int m = this.pix0[(j + 1)];
        int n = this.pix0[(j + this.m_nAppX)];
        int i1 = this.pix0[(j + this.m_nAppX + 1)];
 
        int i = (k & 0xFF0000) >> 16;
        int i2 = ((((m & 0xFF0000) >> 16) - i) * this.ru >> 8) + i;
        i = (k & 0xFF00) >> 8;
        int i3 = ((((m & 0xFF00) >> 8) - i) * this.ru >> 8) + i;
        i = k & 0xFF;
        int i4 = (((m & 0xFF) - i) * this.ru >> 8) + i;
 
        i = (n & 0xFF0000) >> 16;
        int i5 = ((((i1 & 0xFF0000) >> 16) - i) * this.ru >> 8) + i;
        i = (n & 0xFF00) >> 8;
        int i6 = ((((i1 & 0xFF00) >> 8) - i) * this.ru >> 8) + i;
        i = n & 0xFF;
        int i7 = (((i1 & 0xFF) - i) * this.ru >> 8) + i;
 
        int i8 = ((i5 - i2) * this.rv >> 8) + i2;
        int i9 = ((i6 - i3) * this.rv >> 8) + i3;
        int i10 = ((i7 - i4) * this.rv >> 8) + i4;
        this.pix0[j] = (i8 << 16 | i9 << 8 | i10 | 0xFF000000);
      }
 
      rend();
      this.offImage.newPixels(0, 0, this.m_nAppX, this.m_nAppY);
      try {
        Thread.sleep(this.m_sleepTime);
      }
      catch (InterruptedException localInterruptedException2) {
      }
    }
  }
 
  public void update(Graphics paramGraphics) {
    paint(paramGraphics);
  }
 
  public void paint(Graphics paramGraphics)
  {
    paramGraphics.drawImage(this.dbImg, 0, 0, this);
  }
 
  public void start()
  {
    if (this.isError) return;
    this.isRunning = true;
    if (this.runner == null) {
      this.runner = new Thread(this);
      this.runner.start();
    }
  }
 
  public void stop()
  {
    if (this.runner != null) {
      this.runner.stop();
      this.runner = null;
    }
  }
 
  public boolean mouseMove(Event paramEvent, int paramInt1, int paramInt2)
  {
    this.m_mouseX = paramInt1;
    this.m_mouseY = paramInt2;
    return true;
  }
 
  public boolean mouseDown(Event paramEvent, int paramInt1, int paramInt2)
  {
    this.m_mouseX = paramInt1;
    this.m_mouseY = paramInt2;
    int i = (int)(this.rand.nextDouble() * 256.0D);
    int j = (int)(this.rand.nextDouble() * 256.0D);
    int k = (int)(this.rand.nextDouble() * 256.0D);
    int m = i << 16 | j << 8 | k | 0xFF000000;
    int n = 0;
    for (int i1 = 0; i1 < this.bits; i1++)
      if (this.bit_f[i1] == 0) {
        this.bit_px[i1] = this.m_mouseX;
        this.bit_py[i1] = this.m_mouseY;
        double d1 = this.rand.nextDouble() * 6.28D;
        double d2 = this.rand.nextDouble();
        this.bit_vx[i1] = (Math.sin(d1) * d2);
        this.bit_vy[i1] = (Math.cos(d1) * d2);
        this.bit_l[i1] = ((int)(this.rand.nextDouble() * 100.0D) + 100);
        this.bit_p[i1] = (int)(this.rand.nextDouble() * 3.0D);
        this.bit_c[i1] = m;
        this.bit_sx[i1] = this.m_mouseX;
        this.bit_sy[i1] = (this.m_nAppY - 5);
        this.bit_f[i1] = 2;
        n++;
        if (n == this.bit_max)
          break;
      }
    if (this.bit_sound > 1) this.sound2.play();
    return true;
  }
 
  public boolean mouseExit(Event paramEvent, int paramInt1, int paramInt2)
  {
    this.m_mouseX = paramInt1;
    this.m_mouseY = paramInt2;
    return true;
  }
 
  void rend()
  {
    int i = 0; int j = 0;
    int k = 0;
 
    for (int m = 0; m < this.bits; m++) {
      switch (this.bit_f[m])
      {
      case 1:
        this.bit_vy[m] += this.rand.nextDouble() / 50.0D;
        this.bit_px[m] += this.bit_vx[m];
        this.bit_py[m] += this.bit_vy[m];
        this.bit_l[m] -= 1;
 
        if ((this.bit_l[m] == 0) || (this.bit_px[m] < 0.0D) || (this.bit_py[m] < 0.0D) || (this.bit_px[m] > this.m_nAppX) || (this.bit_py[m] > this.m_nAppY - 3)) {
          this.bit_c[m] = -16777216;
          this.bit_f[m] = 0;
        }
        else if (this.bit_p[m] == 0) {
          if ((int)(this.rand.nextDouble() * 2.0D) != 0) continue;
          bit_set((int)this.bit_px[m], (int)this.bit_py[m], -1);
        }
        else {
          bit_set((int)this.bit_px[m], (int)this.bit_py[m], this.bit_c[m]);
        }
 
        break;
      case 2:
        this.bit_sy[m] -= 5;
 
        if (this.bit_sy[m] <= this.bit_py[m]) {
          this.bit_f[m] = 1;
          k = 1;
        }
 
        if ((int)(this.rand.nextDouble() * 20.0D) != 0) continue;
        i = (int)(this.rand.nextDouble() * 2.0D);
        j = (int)(this.rand.nextDouble() * 5.0D);
        bit_set(this.bit_sx[m] + i, this.bit_sy[m] + j, -1);
      }
 
    }
 
    if ((k == 1) && (this.bit_sound > 0)) this.sound1.play();
  }
 
  void bit_set(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 + paramInt2 * this.m_nAppX;
    this.pix0[i] = paramInt3;
  }
}