﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BookManagerProject
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void timer_now_Tick(object sender, EventArgs e)
        {
            tool_statusStrip_now.Text
                = DateTime.Now.ToString("yyyy년 MM dd일 HH시 mm분 ss초");
        }
    }
}
