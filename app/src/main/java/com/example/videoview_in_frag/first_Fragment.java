package com.example.videoview_in_frag;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class first_Fragment extends Fragment {
VideoView videoView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_, container, false);
        videoView= view.findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("android.resource://"+view.getContext().getPackageName()+"/"+R.raw.yar));
        MediaController mediaController = new MediaController(getActivity());
        videoView.setMediaController(mediaController);
        videoView.start();
        return view;
    }
}