package com.bean.compose.beancomposelib.lib

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 커스텀 Column 을 만들어보자.
// - 자식 요소들을 수직으로 배치한다.
// - 스크롤 해본다.
// - 자식 요소에 가중치를 적용해보자.
//   e.g. 가중치가 작을수록 큰 비중을 차지해야함. 1,2,3 요소가 있으면 3:2:1 비율로 빈 자리를 차지함.
//   ?. "빈 자리"는 어떻게 계산할 수 있지?

@Composable
fun BeanColumn(
    content: @Composable () -> Unit
) {
}

@Preview
@Composable
fun BeanColumnPreview() {
    BeanColumn {
        Text(text = "hello world")
        Text(text = "hello world veryvery long long".repeat(3))
        Text(text = "BIGIBBIG")
        Text(text = "hello world")
    }
}